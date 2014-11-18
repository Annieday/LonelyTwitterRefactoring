package ca.ualberta.cs.lonelytwitter.data;

import java.io.Serializable;
import java.util.Date;


public class NormalLonelyTweet extends LonelyTweet implements Serializable {

	public NormalLonelyTweet() {
	}

	public NormalLonelyTweet(String text, Date date) {
		this.tweetDate = date;
		this.tweetBody = text;
	}

	@Override
	public boolean isValid() {
		if (tweetBody.trim().length() == 0 || tweetBody.trim().length() > 20) {
			return false;
		}

		return true;
	}

	public String toString() {
		return getTweetDate() + " | " + getTweetBody();
	}

	@Override
	public String getTweetBody() {
		return tweetBody;
	}
}
