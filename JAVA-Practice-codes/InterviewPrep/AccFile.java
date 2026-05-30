
package InterviewPrep;
class AccFile{
    static boolean isValidFile(String fileName){
        return fileName.startsWith("File")&&fileName.length()>5; 
    }

    static int extractVersion(String fileName){


            String versionstr=fileName.substring(5);
            try{
                return Integer.parseInt(versionstr);
            }catch(NumberFormatException e){
                return -1;
            }
    }

    static int findLatestVersion(String []files){
        int latestVersion=-1;

        for(String file:files){
            if(isValidFile(file)){
                int version=extractVersion(file);
                latestVersion=version;
            }

        }
        return latestVersion;
    }


    public static void main(String[] args) {
        // Example usage
        String[] files = {"File 1", "File 5", "File 2", "File 10", "Document 1"};
        int latestVersion = findLatestVersion(files);
        System.out.println("Latest version: " + latestVersion);  // Output should be 10
    }
}