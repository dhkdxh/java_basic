package week5.day19;

public class Button {
    public static interface ClickListener{
        void onClick();
    }

    private ClickListener clickListener;

    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public void click(){
        this.clickListener.onClick();
    }

    public static void main(String[] args) {
        Button buttonOK = new Button();
        //OK버튼이 눌러지면 객체에 람다식 주입

        buttonOK.setClickListener(
                ()-> {
                    System.out.println("OK clicked");
                }
        );

        buttonOK.click();

        Button cancelButton = new Button();

        cancelButton.setClickListener(
                ()-> {
                    System.out.println("Cancel clicked");
                }
        );//cancel 버튼 누르면 뭐할건지 람다식으로 표현

        cancelButton.click(); // 버튼을 누르자
    }
}
