/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4;
import kata4.Model.Histogram;
import org.jfree.ui.ApplicationFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
/**
 *
 * @author gabri
 */
public class HistogramDisplay extends ApplicationFrame {
    private final Histogram<String> histogram;
    public HistogramDisplay(String title, Histogram <String>histogram){
    super(title);
    this.histogram=histogram;
    this.setContentPane(createPanel());
    this.pack();
    }
    private JPanel createPanel(){
    ChartPanel chartpanel=new ChartPanel(createChart(createDataSet()));
    return chartpanel;        
    }
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
    JFreeChart freeChart = ChartFactory.createBarChart("Histograma JFreeChart", 
                                                        "Dominio email",
                                                        "Nº de emails",
                                                        dataSet, PlotOrientation.VERTICAL, false, false,
                                                        rootPaneCheckingEnabled);
    return freeChart;
    }
    private DefaultCategoryDataset createDataSet(){
        DefaultCategoryDataset dataSet= new DefaultCategoryDataset();
        for(String key : histogram.keySet()){
            dataSet.addValue(histogram.get(key),"",key);
        }
        return dataSet;
    }

    public void execute() {
        setVisible(true);
    }
    
    
}
