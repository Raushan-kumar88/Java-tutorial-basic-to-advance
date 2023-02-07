
class CaesarCipher{
   static StringBuffer encrypt(String t,int s){
    StringBuffer result=new StringBuffer();
    for(int i=0;i<t.length();i++){
        if(Character.isUpperCase(t.charAt(i))){
            char ch=(char)(((int)t.charAt(i)+s-67)%26+67);
            result.append(ch);
        }
        else{
            char ch=(char)(((int)t.charAt(i)+s-97)%26+97);
            result.append(ch);
        }
    }
    return result;
   }
    public static void main(String[] args) {
        System.out.println("CaesarCipher code");
        String PlainText="ATTACKATONCE";
        int size=4;
        System.out.println("Plain Text : "+PlainText);
        System.out.println("size : "+size);
        StringBuffer result=encrypt(PlainText,size);
        System.out.println("the ceaser cipher "+ result);

    }
}