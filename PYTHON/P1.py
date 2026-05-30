
def calculateFrq(s):
            # Step 1: Count frequency using simple dictionary
        freq={}
        
        for ch in s:
            if ch in freq:
                freq[ch]+=1
                
            else:
                freq[ch]=1
                
            
            # Step 2: Collect characters that repeat    
        repeated_char=[]
        
        for ch in freq:
            if freq[ch]>=2:
                 repeated_char.append(ch)
    
      # Step 3: Sort by frequency (descending) and ASCII value (ascending)
      
        repeated_char.sort() # ASCII sort first
        repeated_char.sort(key=lambda x:freq[x],reverse=True)        # frequency sort
         
         
         
    # Step 4: Build output string
        result=""
         
        for ch in  repeated_char:
             result+=ch
        return result
        
print(calculateFrq("aabbbcccc"))   # Output: cbac
     
    
    