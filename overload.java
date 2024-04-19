class overload{
private static void display(int a){
System.out.println("ar:"+a);
}
private static void display(int a,int b){
System.out.println("ar:"+a+"and"+"b"+b);
}
public static void main(String[] args){
display(1);
display(2,3);
}
}
