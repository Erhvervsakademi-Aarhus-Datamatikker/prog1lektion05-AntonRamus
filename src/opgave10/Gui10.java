package opgave10;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Gui10 extends Application {
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
        int x = 50;
        int y = 100;
        int r = 40;
        while (x <= 150) {
            drawCircle(gc,x,y,r);
            x += 25;
        }
    }

    private void drawCircle(GraphicsContext gc, int x, int y, int r) {
        gc.strokeOval(x - r,y - r,2 * r, 2 * r);
    }
}
