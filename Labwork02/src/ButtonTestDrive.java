public class ButtonTestDrive {
    public static void main(String[] args) {

    }
}

class Button {
    protected String label;
    protected String color;

    public Button(String label, String color) {
        this.label = label;
        this.color = color;
    }

    public String getLabel() {
        return this.label;
    }

    public String getColor() {
        return this.color;
    }

    public String setLabel(String newLabel) {
        this.label = newLabel;
        return newLabel;
    }

    public String setColor(String newColor) {
        this.color = newColor;
        return newColor;
    }

    public void press() {
        System.out.println(this.label + " pressed!");
    }

    public void unPress() {
        System.out.println(this.label + " unpressed!");
    }

}
