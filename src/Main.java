
public class Main {
    public static void main(String[] args) {
        MagicBox<String> stringBox = new MagicBox<>(3);
        MagicBox<Integer> intBox = new MagicBox<>(5);
        System.out.println(Boolean.TRUE.equals(stringBox.add("Хлеб")));
        System.out.println(Boolean.TRUE.equals(stringBox.add("Колбаса")));
        System.out.println(Boolean.TRUE.equals(stringBox.add("Гвозди")));
        System.out.println(Boolean.TRUE.equals(stringBox.add("Нарды")));
        System.out.println(Boolean.TRUE.equals(intBox.add(0)));
        System.out.println(Boolean.TRUE.equals(intBox.add(300)));
        System.out.println(Boolean.TRUE.equals(intBox.add(76)));
        System.out.println(Boolean.TRUE.equals(intBox.add(88)));
        System.out.println(Boolean.TRUE.equals(intBox.add(22)));
        System.out.println(Boolean.TRUE.equals(intBox.add(44)));
        System.out.println(intBox.pick());
        System.out.println(stringBox.pick());
        MagicBox<String> testBox = new MagicBox<>(3);
        System.out.println(Boolean.TRUE.equals(testBox.add("Шляпа")));
        System.out.println(testBox.pick());
    }
}