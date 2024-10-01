public class PlanoOperadora {
    
    public static void main(String[] args) {
        
        // String plano = "M";

        // if(plano == "B"){
        //     System.out.println("100 minutos de liga��o");
        // }else if(plano == "M"){
        //     System.out.println("100 minutos de liga��o");
        //     System.out.println("Whats e Instagram gr�tis");
        // }else if(plano == "T"){
        //     System.out.println("100 minutos de liga��o");
        //     System.out.println("Whats e Instagram gr�tis");
        //     System.out.println("5Gb YouTube");
        // }

        /* */

        String plano = "M";

        switch(plano) {
            case "T": {            
            System.out.println("5Gb YouTube");
            }
            case "M":{            
            System.out.println("Whats e Instagram grátis");
            }
            case "B":{
            System.out.println("100 minutos de ligação");            
            }
        }

    }

}
