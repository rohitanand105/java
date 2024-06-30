
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class CurrencyExchangeApp extends JFrame {

    private JTextField amountField;
    private JComboBox<String> fromCurrency;
    private JComboBox<String> toCurrency;
    private JLabel resultLabel;

    private static final Map<String, Double> exchangeRates = new HashMap<>();

    static {
        // Example exchange rates (you would typically fetch these from an API)
        exchangeRates.put("USD", 1.0);
        exchangeRates.put("EUR", 0.85);
        exchangeRates.put("GBP", 0.75);
        exchangeRates.put("JPY", 110.0);
    }

    public CurrencyExchangeApp() {
        createView();

        setTitle("Currency Exchange");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void createView() {
        JPanel panel = new JPanel();
        getContentPane().add(panel);

        panel.setLayout(new GridLayout(5, 2, 10, 10));

        JLabel amountLabel = new JLabel("Amount:");
        panel.add(amountLabel);

        amountField = new JTextField();
        panel.add(amountField);

        JLabel fromLabel = new JLabel("From:");
        panel.add(fromLabel);

        fromCurrency = new JComboBox<>(exchangeRates.keySet().toArray(new String[0]));
        panel.add(fromCurrency);

        JLabel toLabel = new JLabel("To:");
        panel.add(toLabel);

        toCurrency = new JComboBox<>(exchangeRates.keySet().toArray(new String[0]));
        panel.add(toCurrency);

        JButton convertButton = new JButton("Convert");
        convertButton.addActionListener(new ConvertButtonActionListener());
        panel.add(convertButton);

        resultLabel = new JLabel("Converted Amount: ");
        panel.add(resultLabel);
    }

    private class ConvertButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double amount = Double.parseDouble(amountField.getText());
                String from = (String) fromCurrency.getSelectedItem();
                String to = (String) toCurrency.getSelectedItem();

                if (from != null && to != null) {
                    double convertedAmount = convertCurrency(amount, from, to);
                    resultLabel.setText(String.format("Converted Amount: %.2f %s", convertedAmount, to));
                } else {
                    resultLabel.setText("Please select both currencies.");
                }
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid amount.");
            }
        }

        private double convertCurrency(double amount, String from, String to) {
            double fromRate = exchangeRates.get(from);
            double toRate = exchangeRates.get(to);
            return (amount / fromRate) * toRate;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CurrencyExchangeApp().setVisible(true));
    }
}

