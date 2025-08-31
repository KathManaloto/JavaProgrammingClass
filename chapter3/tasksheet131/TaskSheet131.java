package chapter3.tasksheet131;

class Afritada {
    public void showIngredients() {
        String[] Ingredients = {"Tomato Sauce","Meat"};
        System.out.println("Afritada = "+java.util.Arrays.toString(Ingredients)+"🍲 \n");
    }
}

// extend Afritada Class here
class Mechado extends Afritada{
    public void showIngredients(){
        String[] Ingredients = 
        {"Tomado Sauce",
         "Meat",
         "Potatoes & Carrots",
         "Tomato Paste"};
        System.out.println("Mechado = " + java.util.Arrays.toString(Ingredients)+"🍲 \n");;
    }
}

class Menudo extends Afritada{
    public void showIngredients(){
        String[] Ingredients = 
        {"Tomato Sauce",
         "Meat",
         "Potatoes & Carrots",
         "Liver Spread",
         "Raisins",
         "Hotdog"};
        System.out.println("Menudo = "+java.util.Arrays.toString(Ingredients)+"🍲 \n");
    }
}
 
class Caldereta extends Afritada {
    public void showIngredients() {
        String[] Ingredients = 
        {"Tomato Sauce",
        "Meat",
        "Potatoes & Carrots",
        "Tomato Paste",
        "Liver Spread",
        "Raisins",
        "Hotdog",
        "Siling Labuyo",
        "Cheese"};
        System.out.println("Caldereta = "+java.util.Arrays.toString(Ingredients)+"🍲 \n");
  }
}

public class TaskSheet131 {
    public static void main(String[] args) {
      // add 4 meal$ objects here and set the type as the extended Afritada class
        Afritada meal1 = new Afritada();
        Afritada meal2 = new Mechado();
        Afritada meal3 = new Menudo();      
        Afritada meal4 = new Caldereta();

      // display all ingredients at every object
        meal1.showIngredients();
        meal2.showIngredients();
        meal3.showIngredients();
        meal4.showIngredients();   
    }
}