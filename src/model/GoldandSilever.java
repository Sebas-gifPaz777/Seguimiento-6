package model;

import java.util.Comparator;

public class GoldandSilever implements Comparator<Contries> {

	@Override
	public int compare(Contries o1, Contries o2) {
		if(o1.getGoldm()>o2.getGoldm()) {
			return 1;
		}
		else if(o1.getGoldm()<o2.getGoldm()) {
			return -1;
		}
		else {
			if(o1.getSilverm()>o2.getSilverm()) {
				return 1;
			}
			else if(o1.getGoldm()<o2.getGoldm()) {
				return -1;
			}
			else {
				if(o1.getBroncem()>o2.getBroncem()) {
					return 1;
				}
				else if(o1.getBroncem()<o2.getBroncem()) {
					return -1;
				}
				else
					return 0;
			}
		}

	}
}
