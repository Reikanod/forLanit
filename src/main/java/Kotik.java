import java.util.Random;

public class Kotik {
  String name;
  String voice;
  int satiety;
  int weight;

  private static final int METHODS = 5;
  private static final String[] LIST_OF_METHODS = new String[] {"play", "sleep", "wash", "walk", "hunt"};
  private static int count = 0;
  
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
  
  public boolean play() {return act("играется");}
  public boolean sleep() {return act("спит");}
  public boolean wash() {return act("умывается");}
  public boolean walk() {return act("гуляет");}
  public boolean hunt() {return act("охотится");}

  public void doCatMethod(String nameOfMethod) {
    switch (nameOfMethod) {
      case "play":
        play();
        break;
      case "sleep":
        sleep();
        break;
      case "wash":
        wash();
        break;
      case "walk":
        walk();
        break;
      case "hunt":
        hunt();
        break;
      default:
        System.out.println("Котик такого не умеет");
    }
  }
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
