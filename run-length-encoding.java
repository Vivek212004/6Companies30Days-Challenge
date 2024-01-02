class GfG
 {
	String encode(String str)
	{
          //Your code here
          int letterCnt=1;
          //reate a string to store the new output
          String s="";
          //Convert the given string to array for easy tracking of count of letters
          //Create a array of length of str
          char arr[]=new char[str.length()];
          arr=str.toCharArray();
          char first=arr[0];
          for(int i=1;i<arr.length;i++){
              if(first!=arr[i]){
                  //append the letter and count to the newly created string by concatenation
                  s=s+first+letterCnt;
                  //initialize letterCnt to 1 because the count of newcharacter begins
                  letterCnt=1;
                  first=arr[i];
              }
              else{
                  letterCnt++;
              }
              
              
          }
          //appending last uniue letter to the output string
          s=s+first+letterCnt;
          return s;
	}
	
 }
