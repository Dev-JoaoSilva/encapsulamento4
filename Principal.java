public class Principal {
    public static void main(String[] args) {
        
        Perfil perfil = new Perfil("João", 17, "joãozinho", "João1234");

        System.out.println("nome: " +perfil.getNome());
        System.out.println("Idade: " +perfil.getIdade());
        System.out.println("Perfil: " +perfil.getUsername());
        perfil.setSenha("Etec123");  

        if(perfil.verificaSenha("Etec2023")){
            System.out.println("senha inválida");
        }else{
            System.out.println("senha inválida!");
        }

    }
}
