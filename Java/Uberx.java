class UberX extends Car {
  String brand;
  String model;
  // extends es la herencia significa que Uberx herda los atributos de la clase Car y trae sus proprios atributos
  // Como esta clase tiene un metodo constructor es necesario un metodo constructor que debe de tener los atributos necesario en la clase Car
  public UberX(String license, Account driver, String brand, String model) {
    super(license, driver);
    this.model = model;
    this.brand = brand;
  }
  
}
