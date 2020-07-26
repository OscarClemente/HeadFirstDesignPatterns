package factory.abstractFactory.ingredients;

public interface PizzaIngredientFactory {
	public Dough createDought();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClams();
}
