class MaquinaTragaperras {
          
        private int frutas;
        private int fruta1 = 0;
        private int fruta2 = 0;
        private int fruta3 = 0;
        private int premio = 0;

        //Generamos 3 figuras al azar
        private int getRandom() {
            for (int i = 1; i <=3 ; i++) {
            frutas = (int)(Math.random()*6+1);
            }
            return frutas;
        }
            //Asignamos cada caso con una fruta
            private String getNombre(int n) {
                String nombre = "";
                switch (n) {
                case 1: nombre = "Cerezas "; break;
                case 2: nombre = "Sandías "; break;
                case 3: nombre = "Fresa "; break;
                case 4: nombre = "Manzana "; break;
                case 5: nombre = "Límon "; break;
                case 6: nombre = "Naranja "; break;
                default: nombre = "Nada"; break;
                }
                return nombre;
            }

            //Muestra los resultados 
            public String getTirada() {
                String combinacion = "";
                fruta1 = getRandom();
                fruta2 = getRandom();
                fruta3 = getRandom();

                combinacion = combinacion + getNombre(fruta1);
                combinacion = combinacion + getNombre(fruta2);
                combinacion = combinacion + getNombre(fruta3);
                return combinacion;
            }
             //Cada respuesta dependiendo del resultado  
            public int getPremio() {
            if (fruta1 == fruta2 && fruta2 == fruta3) {
                switch (fruta1) {
                    case 1: premio = 30; break;
                    case 2: premio = 20; break;
                    case 3: premio = 10; break;
                    default: premio = 5; break;
                }
            }  
            else if (fruta1 == fruta2 || fruta1 == fruta3 || fruta2 == fruta3) {
                  if (fruta1 == 1 && fruta2 == 1 || fruta1 == 1 && fruta3 == 1 || fruta2 == 1 && fruta3 == 1) {
                    premio = 3;
                } else if (fruta1 == 2 && fruta2 == 2 || fruta1 == 2 && fruta3 == 2 || fruta2 == 2 && fruta3 == 2) {
                    premio = 2;
                } else {
                    premio = 1;
                    }   
                }   else {
                  premio = 0;
            } return premio;
        }
}