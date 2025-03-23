
    public class Path {

        private Ponto[] pontos;
        public Path(Ponto[] pontos){
            setPontos(pontos);
        }
        public double lenght(Ponto[] a){

            double lenght = 0;
            for(int i = 0; i < pontos.length - 1; i++){

                lenght += pontos[i].dist(a[i+1]);

            }
            return lenght;
        }

        public Ponto[] getPontos() {
            return pontos;
        }

        public void setPontos(Ponto[] pontos) {
            if(pontos.length < 2){

                System.out.println("iv");
                System.exit(0);
            }

            this.pontos = pontos;
        }
    }


