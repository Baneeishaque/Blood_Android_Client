package bank.blood.ndk.user;

import java.util.Comparator;


/**
 * A collection of {@link Comparator}s for {@link Donor} objects.
 *
 * @author ISchwarz
 */
public final class Donor_Comparators {

    private Donor_Comparators() {
        //no instance
    }

    public static Comparator<Donor> getDonorNameComparator() {
        return new DonorNameComparator();
    }

    public static Comparator<Donor> getDonorAddressComparator() {
        return new DonorAddressComparator();
    }

    public static Comparator<Donor> getDonorMobileNumberComparator() {
        return new DonorMobileNumberComparator();
    }


    public static Comparator<Donor> getDonorBloodGroupComparator() {
        return new DonorBlood_GroupComparator();
    }

    public static Comparator<Donor> getDonorSnoComparator() {
        return new DonorSnoComparator();
    }


    private static class DonorNameComparator implements Comparator<Donor> {

        @Override
        public int compare(final Donor donor1, final Donor donor2) {
            return donor1.getName().compareTo(donor2.getName());
        }
    }

    private static class DonorAddressComparator implements Comparator<Donor> {

        @Override
        public int compare(final Donor donor1, final Donor donor2) {
            return donor1.getAddress().compareTo(donor2.getAddress());
        }
    }

    private static class DonorMobileNumberComparator implements Comparator<Donor> {

        @Override
        public int compare(final Donor donor1, final Donor donor2) {
            return donor1.getMobile_number().compareTo(donor2.getMobile_number());
        }
    }

    private static class DonorBlood_GroupComparator implements Comparator<Donor> {

        @Override
        public int compare(final Donor donor1, final Donor donor2) {
            return donor1.getBlood_group().compareTo(donor2.getBlood_group());
        }
    }


    private static class DonorSnoComparator implements Comparator<Donor> {

        @Override
        public int compare(final Donor donor1, final Donor donor2) {
            if (donor1.getSno() < donor2.getSno()) return -1;
            if (donor1.getSno() > donor2.getSno()) return 1;
            return 0;
        }
    }

}
