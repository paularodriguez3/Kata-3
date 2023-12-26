package software.ulpgc.kata3;

public class Main {

    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        mainFrame.histogramDisplay().show(histogram());
        mainFrame.setVisible(true);
    }

    private static Histogram histogram() {
        Histogram histogram = new Histogram() {
            @Override
            public int bins() {
                return 6;
            }

            @Override
            public double[] values() {
                return new double[]{10, 58, 3, 4, 89, 45, 9, 7, 96, 4, 7, 9};
            }
        };
        return histogram;
    }
}
