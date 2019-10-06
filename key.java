

import java.util.Scanner;



public class Key{

    private Scanner sc = new Scanner(System.in);
    private String name;
    private String lastName;
    private String nameC;
    private String nameV;
    private String lastnC;
    private String lastnV;
    private String key = null;
    private int years;
    private int yearbirth = 0;
    
    public Key(){
    	
    	   nameC = "";
           nameV="";
           lastnC = "";
           lastnV = "";
           name = "";
           lastName = "";
           lastnC = "";
           lastnV = "";
           yearbirth=0;
    }

    private void registration(){

        System.out.println("Bienvenido a codigoJava, para ingresar necesitaremos unos pocos datos...");
        System.out.println("Porfavor ingresa tu nombre");
        name = sc.nextLine();
        System.out.println("Porfavor ingresa tu apellido");
        lastName = sc.nextLine();
        System.out.println("Y para terminar año de nacimiento");
        while(yearbirth<1900 || yearbirth>2019){
            yearbirth = sc.nextInt();
        }
    }
    
    public int years(int yearbirth){
        years = 2019 - yearbirth;
        return years;
    }

    private String keyBuilder(){

        for(int i = 0; i < name.length(); i++){
            if(name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u' ){
                nameV = name.charAt(i) + nameV;
            }else{
                nameC = nameC + name.charAt(i);
            }
        }
        for(int o = 0; o < lastName.length() ; o++){
            if(lastName.charAt(o) == 'a' || lastName.charAt(o) == 'e' || lastName.charAt(o) == 'i' || lastName.charAt(o) == 'o' || lastName.charAt(o) == 'u' ){
                lastnV = lastName.charAt(o) + lastnV;
            }else{
                lastnC = lastnC + lastName.charAt(o);
            }
        }
        
        if(lastnC.length() > nameC.length()){
            key = lastnC.toUpperCase() + nameV.toUpperCase() + years(yearbirth);
        }else{
            key = nameC.toUpperCase() + lastnV.toUpperCase() + years(yearbirth);
            
        }return key;
    }

   
    
    public static void main(String[]args){
    	
        Key newUser = new Key();
        newUser.registration();
        System.out.println(newUser.keyBuilder());
        
    }
}