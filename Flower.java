class Flower{
 String name;
 String colour;
 String noofpetals;

void sheddingfragrance (){
  System.out.println(colour+" "+name+" "+"is shedding fragrance");
}

void blooming(){
  System.out.println(colour+" "+name+" "+"is blooming");
}

public static void main(String args[]){
   Flower rose = new Flower();
       rose.name = "Rose";
       rose.colour = "Red";
       rose.noofpetals = "12";
      
       rose.sheddingfragrance();
       rose.blooming();

    Flower jasmine = new Flower();
       jasmine.name = "Jasmine";
      jasmine.colour = "White";
       jasmine.noofpetals = "7";
      
       jasmine.sheddingfragrance();
       jasmine.blooming();

   
    Flower lily = new Flower();
       lily.name = "Lily";
      lily.colour = "White";
       
     lily.sheddingfragrance();
     lily.blooming();
  
     Flower hibiscus= new Flower();
      hibiscus.name = "Hibiscus";
      hibiscus.colour = "Pink";
       
    hibiscus.sheddingfragrance();
    hibiscus.blooming();

   Flower sunflower= new Flower();
     sunflower.name = "Sunflower";
      sunflower.colour = "Yellow";
       
   sunflower.sheddingfragrance();
   sunflower.blooming();

      
}
}