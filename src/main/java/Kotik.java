import java.util.Random;

public class Kotik {
  String name;
  String voice;
  int satiety;
  int weight;

  private static final int METHODS = 5;
  private static final String[] LIST_OF_METHODS = new String[] {"play", "sleep", "wash", "walk", "hunt"};
  private static int count = 0; // количество созданных экземпляров класса

  // Конструкторы
  public Kotik(String name, String voice, int satiety, int weight) {
    count++;
    this.name = name;
    this.voice = voice;
    this.satiety = satiety;
    this.weight = weight;
  }

  public Kotik() {
    count++;
  }

  // методы экземпляров
    // Главные методы котов
  public boolean play() {return act("играется");}
  public boolean sleep() {return act("спит");}
  public boolean wash() {return act("умывается");}
  public boolean walk() {return act("гуляет");}
  public boolean hunt() {return act("охотится");}

    // Методы питания котов
   public void eat(int satiety) {
    this.satiety += satiety;
  }
  
  public void eat(int satiety, String foodName) {
    this.satiety += satiety;
    System.out.println("Котик скушал: " + foodName);
  }
  
  public void eat() {
    this.eat(10, "кошачий корм");
  }

  // Вспомогательные методы
    // Запускает главный метод
  private boolean act(String action) {
    if (this.satiety > 0) {
      System.out.println("Котик " + action);
      this.satiety--;
      return true;
    } else {
      System.out.println("Дай сначала поесть, изверг!");
      return false;
    }
  }
    // 
  public Boolean doCatMethod(String nameOfMethod) {
    boolean methodDone;
    switch (nameOfMethod) {
      case "play":
        methodDone = play();
        break;
      case "sleep":
        methodDone = sleep();
        break;
      case "wash":
        methodDone = wash();
        break;
      case "walk":
        methodDone = walk();
        break;
      case "hunt":
        methodDone = hunt();
        break;
      default:
        System.out.println("Обишка. Котик не имеет метода " + nameOfMethod);
    }
    if (methodDone == true) {return true}
    else if (methodDone == false ) {return false}
    else {
      System.out.println("Обишка. Котик не имеет метода " + nameOfMethod);
      return null;
    }
  }
 
  public void liveAnotherDay() {
    Random rand = new Random();
    int choice;
    String randomMethod;
    for(int i = 0; i < 24; i++) {
      choise = rand.nextInt(LIST_OF_METHODS.length);
      doCatMethod(LIST_OF_METHODS[choice]);
      
    }
  }
}
