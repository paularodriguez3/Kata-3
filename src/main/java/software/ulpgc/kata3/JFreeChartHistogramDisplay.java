package software.ulpgc.kata3;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.statistics.HistogramDataset;

import javax.swing.*;

public class JFreeChartHistogramDisplay extends JPanel implements HistogramDisplay {
    @Override
    public void show(Histogram provider) {
        JFreeChart histogram = ChartFactory.createHistogram(
                "","ages","",datasetWith(provider),PlotOrientation.VERTICAL,
                false, false, false
        );
        add(new ChartPanel(histogram));
    }

    private HistogramDataset datasetWith(Histogram histogram){
        HistogramDataset dataset = new HistogramDataset();
        dataset.addSeries("s", histogram.values(), histogram.bins());
        return dataset;
    }
}
