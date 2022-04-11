package lab3.factory;

public class NYPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String type){
        switch( type ){
            case "Cheese": return new NYstyleCheesePizza();
            case "Peperoni": return new NYstylePeperoniPizza();
            default: return null;
        }
    }
}
