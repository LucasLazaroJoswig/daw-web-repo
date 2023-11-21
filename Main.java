public class Main{
    
    public static void main(String[] args){
        String usuario = "Lucas";
        String password = "Lazaro"; 
        if(!usuario.equals(args[0]) && !password.equals(args[1])){
            System.out.println("Usuario y Contraseña Incorrectas");
        }else if (!usuario.equals(args[0]) && password.equals(args[1])){
            System.out.println("Usuario incorrecto");
        }else if (usuario.equals(args[0]) && !password.equals(args[1])){
            System.out.println("Contraseña incorrecta");
        }else{
            System.out.println("Acceso Permitido");
        }

}
}
