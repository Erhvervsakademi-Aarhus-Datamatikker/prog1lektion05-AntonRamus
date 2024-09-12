package opgave12;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Gui12 extends Application {
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
        double x = 20;
        double y = 100;
        double h = 81;
        drawTriangle(gc,x,y,h);
        drawInnerTriangle(gc,x,y,h);
        drawInnerTriangle(gc,x,y,h / 3);
        drawInnerTriangle(gc,x + 2 * h - (2 * h / 3),y ,h / 3);
        drawInnerTriangle(gc, x + h - (h / 3),y - h + (h / 3), h /3);
    }

    private void drawTriangle (GraphicsContext gc, double x, double y, double h) {
        gc.strokeLine(x,y,x + h * 2, y);
        gc.strokeLine(x,y,x + h,y - h);
        gc.strokeLine(x + h,y - h,x + h * 2, y);
    }

    private void drawInnerTriangle (GraphicsContext gc, double x, double y, double h) {
        double hSmall = h / 3;
        drawTriangle(gc,x,y,hSmall);
        drawTriangle(gc,x + 2 * h -(2 * hSmall),y,hSmall);
        drawTriangle(gc,x + h - hSmall,y - h + hSmall,hSmall);

    }
}
