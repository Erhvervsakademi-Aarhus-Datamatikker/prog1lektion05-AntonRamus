package opgave06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Gui06 extends Application {
    @Override
    public void start(Stage stage) {
        GridPane root = this.initContent();
        Scene scene = new Scene(root);

        stage.setTitle("Loops");
        stage.setScene(scene);
        stage.show();
    }

    private GridPane initContent() {
        GridPane pane = new GridPane();
        Canvas canvas = new Canvas(200, 200);
        pane.add(canvas, 0, 0);
        this.drawShapes(canvas.getGraphicsContext2D());
        return pane;
    }

    // ------------------------------------------------------------------------

    private void drawShapes(GraphicsContext gc) {
        gc.strokeLine(5,175,180,175);
        gc.strokeLine(180,175,170,180);
        gc.strokeLine(180,175,170,170);

        int y1 = 170;
        int y2 = 180;
        for (int i = 0; i <= 11; i++) {
            int x = 5 + i * 14;
            gc.strokeLine(x,y1,x,y2);
        }

        for (int i = 0; i <= 3; i++) {
            int x = 5 + i * 70;
            gc.strokeLine(x,y1 - 5,x,y2 + 5);
        }

        gc.fillText("0",2,195);
        gc.fillText("5",72,195);
        gc.fillText("10",139,195);

    }
}
