Singleton need three steps

1. Create private constructor to avoid getting used out of class.
2. Create static reference of same class
3. Create static method to get instance (synchronized for thread safe)

classDiagram
      Animal <|-- Duck
      Animal <|-- Fish
      Animal <|-- Zebra
      Animal : +int age
      Animal : +String gender
      Animal: +isMammal()
      Animal: +mate()
      class Duck{
          +String beakColor
          +swim()
          +quack()
      }
      class Fish{
          -int sizeInFeet
          -canEat()
      }
      class Zebra{
          +bool is_wild
          +run()
      }



  ```mermaid
  graph TD;
      A-->B;
      A-->C;
      B-->D;
      C-->D;
  ```