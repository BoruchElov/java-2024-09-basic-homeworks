package ru.otus.java.basic.homeworks.utilities;

public class Box {

    private int width;
    private int height;
    private int depth;
    private String color;
    private boolean isOpened;
    String stuffInTheBox;

    public enum Colors {
        Brown, Yellow, Red, Green, Blue
    }

    public enum Sizes {
        Large, Medium, Small
    }

    /**
     * <p>Конструктор класса <code>Box</code>. Позволяет инициализировать размеры и цвет коробки, а также её
     * состояние: открыта она или закрыта.</p>
     *
     * @param color    цвет коробки (коричневый, жёлтый, красный, зелёный, синий)
     * @param size     размер коробки (большая - 60х35х30, средняя - 31х25х38, маленькая - 33х25х15)
     * @param isOpened статус коробки (<code>true</code> - открыта, <code>false</code> - закрыта)
     */
    public Box(Colors color, Sizes size, boolean isOpened) {

        switch (color) {
            case Brown:
                this.color = "коричневый";
                break;
            case Yellow:
                this.color = "жёлтый";
                break;
            case Red:
                this.color = "красный";
                break;
            case Green:
                this.color = "зелёный";
                break;
            case Blue:
                this.color = "синий";
                break;
            default:
                this.color = "коричневый";
                break;
        }

        switch (size) {
            case Large:
                width = 35;
                height = 30;
                depth = 60;
                break;
            case Medium:
                width = 25;
                height = 38;
                depth = 31;
                break;
            case Small:
                width = 25;
                height = 15;
                depth = 33;
                break;
            default:
                width = 25;
                height = 38;
                depth = 31;
                break;
        }

        this.isOpened = isOpened;
        stuffInTheBox = null;
    }

    /**
     * Метод для перекраски коробки
     *
     * @param color новый цвет коробки (коричневый, жёлтый, красный, зелёный, синий)
     */
    public void setColor(Colors color) {
        switch (color) {
            case Brown:
                this.color = "коричневый";
                break;
            case Yellow:
                this.color = "жёлтый";
                break;
            case Red:
                this.color = "красный";
                break;
            case Green:
                this.color = "зелёный";
                break;
            case Blue:
                this.color = "синий";
                break;
            default:
                this.color = "коричневый";
                break;
        }
        System.out.println("Коробку перекрасили в " + this.color + ".");
    }

    /**
     * Метод для открытия коробки.
     */
    public void open() {
        isOpened = true;
        System.out.println("Коробка открыта.");
    }

    /**
     * Метод для закрытия коробки.
     */
    public void close() {
        isOpened = false;
        System.out.println("Коробка закрыта.");
    }

    /**
     * Метод, позволяющий положить предмет в коробку.
     *
     * @param stuff предмет, который кладётся в коробку
     */
    public void putInside(String stuff) {
        if (isOpened) {
            if (stuffInTheBox == null) {
                stuffInTheBox = stuff;
                System.out.println("В коробку положили " + stuff + ".");
            } else {
                System.out.println("Невозможно положить " + stuff + " в коробку - в ней уже лежит "
                        + stuffInTheBox + " .");
            }
        } else {
            System.out.println("Невозможно положить " + stuff + " в коробку - она закрыта.");
        }
    }

    /**
     * Метод, позволяющий опустошить коробку.
     */
    public void draw() {
        if (isOpened) {
            stuffInTheBox = null;
            System.out.println("В коробке больше ничего не лежит.");
        } else {
            System.out.println("Невозможно опустошить коробку - она закрыта.");
        }
    }

    /**
     * Метод для печати информации о коробке.
     */
    public void printInfo() {
        System.out.println("Размеры коробки: " + depth + "x" + width + "x" + height + ".");
        System.out.println("Цвет коробки: " + color + ".");
        if (isOpened) {
            System.out.println("Коробка открыта.");
        } else {
            System.out.println("Коробка закрыта.");
        }
        if (this.stuffInTheBox == null) {
            System.out.println("В коробке ничего не лежит");
        } else {
            System.out.println("В коробке лежит " + stuffInTheBox + ".");
        }
    }
}
