package factory.ingredient;

import product.ingredient.Cheese;
import product.ingredient.Dough;
import product.ingredient.Sauce;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
}
