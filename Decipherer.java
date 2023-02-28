

class Decipherer {
    public static String countLength(String str) {
        String msg = str.substring(5,5+ str.length()/2);
        msg = msg.replace("@#?", " ");

        String result = "";
        for (int i=msg.length() -1; i >=0; i--){
            result = result + msg.charAt(i);
        }
        return result ;

       
    }


    public static void main(String[] args) {
        
        String phrase1 = "0@sn9sirppa@#?ia'jgtvryko1";
         String phrase2 = "q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj";
          String phrase3 = "aopi?sedohtém@#?sedhtmg+p9l!";
        System.out.println(countLength(phrase1));
        System.out.println(countLength(phrase2));
        System.out.println(countLength(phrase3));
  

        // System.out.println("");
       

        // System.out.println("");
       
    };
}