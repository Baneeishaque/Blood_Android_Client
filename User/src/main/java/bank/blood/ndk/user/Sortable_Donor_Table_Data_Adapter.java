package bank.blood.ndk.user;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import de.codecrafters.tableview.TableView;
import de.codecrafters.tableview.toolkit.LongPressAwareTableDataAdapter;

import static android.graphics.Color.BLACK;


public class Sortable_Donor_Table_Data_Adapter extends LongPressAwareTableDataAdapter<Donor> {

    private static final int TEXT_SIZE = 14;
//    private static final NumberFormat PRICE_FORMATTER = NumberFormat.getNumberInstance();


    public Sortable_Donor_Table_Data_Adapter(final Context context, final List<Donor> data, final TableView<Donor> tableView) {
        super(context, data, tableView);
    }

    @Override
    public View getDefaultCellView(int rowIndex, int columnIndex, ViewGroup parentView) {
        final Donor lottery_ticket = getRowData(rowIndex);
        View renderedView = null;

        switch (columnIndex) {
            case 0:
                renderedView = renderString(String.valueOf(lottery_ticket.getSno()));
                break;
            case 1:
                renderedView = renderString(lottery_ticket.getName());
                break;
            case 2:
                renderedView = renderString(lottery_ticket.getAddress());
                break;
            case 3:
                renderedView = renderString(lottery_ticket.getMobile_number());
                break;
//            case 4:
//                renderedView = renderString(lottery_ticket.getName()+"["+lottery_ticket.getAgent()+"]");
//                break;
        }

        return renderedView;
    }

    @Override
    public View getLongPressCellView(int rowIndex, int columnIndex, ViewGroup parentView) {
        return getDefaultCellView(rowIndex, columnIndex, parentView);
    }


    private View renderString(final String value) {
        final TextView textView = new TextView(getContext());
        textView.setText(value);
        textView.setTextColor(BLACK);
        textView.setPadding(20, 10, 20, 10);
        textView.setTextSize(TEXT_SIZE);
        return textView;
    }


}
