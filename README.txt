Java

IntelliJ
Récupérer une fonction et lui rajouter du code : @Override
public void displayInfo() {
    super.displayInfo();
    System.out.println("Subject :" + subject);
}

Constructeur :
public Book(String author) {
    this.author = author;
}

Récupérer les données de l’utilisateur
Scanner scanner = new Scanner (System.in)
Int number = scanner.nextIn();

catch(Exception e)
Possible de mettre différent type d’exception : catch(InputMismatchException | ArithmeticException)

Créer un tableau :
int [] tab = {1, 2, 3, 4, 5};
Arrays.sort(tab) : trier le tableau
Arrays.binarySearch(element) : chercher un élément dans un tableau
Faire un tableau à plusieurs dimensions:
int[][] matrix = new int[3][3] (==> dimensions de chaque sous tableau)
matrix[0][0] = 1;

Créer une liste :
public static void main(String[] args) {
    java.util.List<String> fruits = new ArrayList<>();
    fruits.add("Apple");
    fruits.add("Guava");
    fruits.add("Mango");

    fruits.get(1);
}

Pour retirer l’élément : fruits.remove(« Apple « )

Pour trier les éléments Collections.sort(fruits)
Voir si y a un élément : fruits.contains(« Banana »)

Boucle foreach avec for :
For (String fruit: fruits) {
system.out/println(fruit);}

Autre type de boucle :
Iterator<String> it = fruits.iterator();
While (it.hasNext()) {
	System.out.println(it.next());
}

Set : 
TreeSet : par ordre alphabétique ou croissant
Set.of(‘Nissan’, ‘Toyota’)

cards.addAll(others) => rajouter les éléments de others dans cards


Map :
Map<String, Integer> courses = new HashMap<>();
courses.put("Physics", 6);
courses.put("English", 3);
courses.put("Maths", 4);

For (String key : courses.keySet()) {
	System.out.println(key);
}

Pour afficher les valeurs courses.value

Tapages des classes :
public class Box<T> {
    private T t;

    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }
}


Box<Integer> integerBox = new Box<>();
Box<String> stringBox = new Box<>();

integerBox.set(10);
stringBox.set("hello");


Interface fonctionnelle:
Une seule méthode abstraite

Design pattern : solution aux problèmes courants

Maven : construire notre projet
Gradel

SOLID : essentiel pour la POO
Single Responsibility :
Une seule responsabilité par classe
Open/Closed Principle
Créer des interfaces pour des actions communes
Liskov Substitution Principale
Classe parente peut être substituée 
Interface Segregation Principale
Regrouper tous les éléments dans différentes interfaces pour pas obligé d’implémenter des méthodes dont on n’a pas besoin
Dependency Inversion Principle
 