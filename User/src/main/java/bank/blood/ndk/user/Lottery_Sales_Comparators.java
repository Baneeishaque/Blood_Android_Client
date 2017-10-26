package bank.blood.ndk.user;

import java.util.Comparator;

import ndk.snake_master.sortable_table.Lottery_ticket;


/**
 * A collection of {@link Comparator}s for {@link Donor} objects.
 *
 * @author ISchwarz
 */
public final class Lottery_Sales_Comparators {

    private Lottery_Sales_Comparators() {
        //no instance
    }

    public static Comparator<Donor> getDonorNameComparator() {
        return new DonorNameComparator();
    }

    public static Comparator<Donor> getSchemeComparator() {
        return new SchemeComparator();
    }

    public static Comparator<Lottery_ticket> getSerialComparator() {
        return new SerialComparator();
    }

    public static Comparator<Lottery_ticket> getSnoComparator() {
        return new SnoComparator();
    }


    public static Comparator<Lottery_ticket> getAgentIDComparator() {
        return new AgentIDComparator();
    }

    public static Comparator<Lottery_ticket> getCountComparator() {
        return new CountComparator();
    }


    private static class DonorNameComparator implements Comparator<Donor> {

        @Override
        public int compare(final Donor donor1, final Donor donor2) {
            return donor1.getName().compareTo(donor2.getName());
        }
    }

    private static class CountComparator implements Comparator<Lottery_ticket> {

        @Override
        public int compare(final Lottery_ticket lottery_ticket1, final Lottery_ticket lottery_ticket2) {
            if (Integer.parseInt(lottery_ticket1.getCount()) < Integer.parseInt(lottery_ticket2.getCount())) return -1;
            if (Integer.parseInt(lottery_ticket1.getCount()) > Integer.parseInt(lottery_ticket2.getCount())) return 1;
            return 0;
        }
    }

    private static class SnoComparator implements Comparator<Lottery_ticket> {

        @Override
        public int compare(final Lottery_ticket lottery_ticket1, final Lottery_ticket lottery_ticket2) {
            if (Integer.parseInt(lottery_ticket1.getSno()) < Integer.parseInt(lottery_ticket2.getSno())) return -1;
            if (Integer.parseInt(lottery_ticket1.getSno()) > Integer.parseInt(lottery_ticket2.getSno())) return 1;
            return 0;
        }
    }

    private static class SerialComparator implements Comparator<Lottery_ticket> {

        @Override
        public int compare(final Lottery_ticket lottery_ticket1, final Lottery_ticket lottery_ticket2) {
            if (Integer.parseInt(lottery_ticket1.getSerial()) < Integer.parseInt(lottery_ticket2.getSerial())) return -1;
            if (Integer.parseInt(lottery_ticket1.getSerial()) > Integer.parseInt(lottery_ticket2.getSerial())) return 1;
            return 0;
        }
    }

}
