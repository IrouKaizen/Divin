/*Voici un programme Java simple qui représente ce concept (voir image) 
en utilisant des classes et des méthodes pour simuler la notion de
"Source" et de création fractale :
*/

public class SourceDivine {

    // Représente la Source infinie
    static class Source {
        String essence = "Divin";

        // La Source se manifeste par création
        public Creation creer() {
            return new Creation(this.essence);
        }
    }

    // Représente ce qui est créé par la Source
    static class Creation {
        String essence;

        public Creation(String essence) {
            this.essence = essence;
        }

        public void seDecrire() {
            System.out.println("Je suis une création avec une essence " + essence + " !");
        }
    }

    public static void main(String[] args) {
        // La Source se manifeste
        Source source = new Source();
        System.out.println("La Source se manifeste avec une essence : " + source.essence);

        // La Source crée quelque chose
        Creation creation = source.creer();
        creation.seDecrire();

        // Reconnaître que nous faisons partie de cette Source
        System.out.println("Nous sommes des êtres divins car nous venons de la Source !");
    }
}

/*Explication
1. Classe Source : Représente la "Source" avec une essence divine.
2. Classe Creation : Représente ce que la Source crée, qui hérite de la même essence.
3. Méthodes : La Source crée une instance de Creation, illustrant le concept de fractales ou d'attributs similaires.
4. Sortie : Montre que tout ce qui est créé partage la même essence divine.
*/
