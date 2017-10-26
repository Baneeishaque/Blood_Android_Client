package bank.blood.ndk.user;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;

import de.codecrafters.tableview.SortableTableView;
import de.codecrafters.tableview.model.TableColumnWeightModel;
import de.codecrafters.tableview.toolkit.SimpleTableHeaderAdapter;
import de.codecrafters.tableview.toolkit.SortStateViewProviders;
import de.codecrafters.tableview.toolkit.TableDataRowBackgroundProviders;


/**
 * An extension of the {@link SortableTableView} that handles {@link Donor}s.
 *
 * @author ISchwarz
 */

public class Sortable_Sales_TableView extends SortableTableView<Donor> {

    public Sortable_Sales_TableView(final Context context) {
        this(context, null);
    }

    public Sortable_Sales_TableView(final Context context, final AttributeSet attributes) {
        this(context, attributes, android.R.attr.listViewStyle);
    }

    public Sortable_Sales_TableView(final Context context, final AttributeSet attributes, final int styleAttributes) {
        super(context, attributes, styleAttributes);

        final SimpleTableHeaderAdapter simpleTableHeaderAdapter = new SimpleTableHeaderAdapter(context, "#","Name","Address","Mobile No.","BGroup");
        simpleTableHeaderAdapter.setTextColor(ContextCompat.getColor(context, R.color.table_header_text));
        setHeaderAdapter(simpleTableHeaderAdapter);

        final int rowColorEven = ContextCompat.getColor(context, R.color.table_data_row_even);
        final int rowColorOdd = ContextCompat.getColor(context, R.color.table_data_row_odd);
        setDataRowBackgroundProvider(TableDataRowBackgroundProviders.alternatingRowColors(rowColorEven, rowColorOdd));
        setHeaderSortStateViewProvider(SortStateViewProviders.brightArrows());

        final TableColumnWeightModel tableColumnWeightModel = new TableColumnWeightModel(5);
        tableColumnWeightModel.setColumnWeight(0, 2);
        tableColumnWeightModel.setColumnWeight(1, 2);
        tableColumnWeightModel.setColumnWeight(2, 2);
        tableColumnWeightModel.setColumnWeight(3, 3);
        tableColumnWeightModel.setColumnWeight(3, 2);
        setColumnModel(tableColumnWeightModel);

        setColumnComparator(0, Lottery_Sales_Comparators.getSnoComparator());
        setColumnComparator(1, Lottery_Sales_Comparators.getSerialComparator());
        setColumnComparator(2, Lottery_Sales_Comparators.getCountComparator());
        setColumnComparator(3, Lottery_Sales_Comparators.getDonorNameComparator());
        setColumnComparator(4, Lottery_Sales_Comparators.getDonorNameComparator());
    }

}
