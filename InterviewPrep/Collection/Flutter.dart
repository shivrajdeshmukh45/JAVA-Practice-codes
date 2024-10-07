import 'package:sqflite/sqflite.dart';
import 'package:path/path.dart';
import 'package:path_provider/path_provider.dart';

class DatabaseHelper {
  static final DatabaseHelper _instance = DatabaseHelper._internal();
  static Database? _database;

  factory DatabaseHelper() {
    return _instance;
  }

  DatabaseHelper._internal();

  Future<Database> get database async {
    if (_database != null) return _database!;
    _database = await _initDatabase();
    return _database!;
  }

  Future<Database> _initDatabase() async {
    final dbPath = await getDatabasesPath();
    String path = join(dbPath, 'todoList.db');

    return await openDatabase(
      path,
      version: 1,
      onCreate: _onCreate,
    );
  }

  Future<void> _onCreate(Database db, int version) async {
    await db.execute('''
      CREATE TABLE todos (
        id INTEGER PRIMARY KEY AUTOINCREMENT,
        title TEXT,
        description TEXT,
        date TEXT
      )
    ''');
  }

  // Insert a new task
  Future<int> insertTask(ToDoModelClass task) async {
    final db = await database;
    return await db.insert('todos', task.toDoMap());
  }

  // Get all tasks
  Future<List<ToDoModelClass>> getTasks() async {
    final db = await database;
    final List<Map<String, dynamic>> tasks = await db.query('todos');
    return List.generate(tasks.length, (i) {
      return ToDoModelClass(
        title: tasks[i]['title'],
        description: tasks[i]['description'],
        date: tasks[i]['date'],
      );
    });
  }

  // Update a task
  Future<int> updateTask(ToDoModelClass task) async {
    final db = await database;
    return await db.update(
      'todos',
      task.toDoMap(),
      where: 'id = ?',
      whereArgs: [task.id],
    );
  }

  // Delete a task
  Future<int> deleteTask(int id) async {
    final db = await database;
    return await db.delete('todos', where: 'id = ?', whereArgs: [id]);
  }
}



////Model Classs
class ToDoModelClass {
  int? id;
  String title;
  String description;
  String date;

  ToDoModelClass({
    this.id,
    required this.title,
    required this.description,
    required this.date,
  });

  Map<String, dynamic> toDoMap() {
    return {
      'id': id,
      'title': title,
      'description': description,
      'date': date,
    };
  }

  // Convert from Map to ToDoModelClass
  factory ToDoModelClass.fromMap(Map<String, dynamic> json) {
    return ToDoModelClass(
      id: json['id'],
      title: json['title'],
      description: json['description'],
      date: json['date'],
    );
  }
}


////////
final DatabaseHelper _dbHelper = DatabaseHelper();

Future<void> _loadTasks() async {
  List<ToDoModelClass> tasks = await _dbHelper.getTasks();
  setState(() {
    todoList = tasks;
  });
}

void submit(bool doedit, [ToDoModelClass? toDoModelClass]) async {
  if (_titleEditingController.text.trim().isNotEmpty &&
      _descriptionEditingController.text.trim().isNotEmpty &&
      _dateEditingController.text.trim().isNotEmpty) {
        
    if (!doedit) {
      // Add new task
      ToDoModelClass newTask = ToDoModelClass(
        title: _titleEditingController.text.trim(),
        description: _descriptionEditingController.text.trim(),
        date: _dateEditingController.text.trim(),
      );
      await _dbHelper.insertTask(newTask);
    } else {
      // Update existing task
      toDoModelClass!.title = _titleEditingController.text.trim();
      toDoModelClass.description = _descriptionEditingController.text.trim();
      toDoModelClass.date = _dateEditingController.text.trim();
      await _dbHelper.updateTask(toDoModelClass);
      
    }

    _loadTasks();
  }
  clearController();
}


//Remove Task
void removeTask(ToDoModelClass toDoModelClass) async {
  await _dbHelper.deleteTask(toDoModelClass.id!);
  _loadTasks();
}

//Initialize Tasks on Startup: Update the initState method to load tasks from SQLite when the app starts.
@override
void initState() {
  super.initState();
  _loadTasks();
}



