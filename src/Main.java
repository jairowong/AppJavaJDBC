import com.iroman.entity.Category;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Category category= new Category();
        category.setId(1L);
        category.setDescription("descripcion");
        category.setName("name");

        System.out.println("categoria es:"+ category.getName());
    }
}