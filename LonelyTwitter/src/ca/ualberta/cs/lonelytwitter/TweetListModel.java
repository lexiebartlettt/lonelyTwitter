package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class TweetListModel {
	private ArrayList<LonelyTweetModel> tweets;
	
	public TweetListModel(){
		super();
		tweets= new ArrayList<LonelyTweetModel>();
	}
	public void add (LonelyTweetModel lonelyTweetModel){
		for (int i=0; i<tweets.size();i++){
			if (tweets.get(i)==lonelyTweetModel){
				throw new IllegalArgumentException("You Tried to Add a Duplicate");
			}
		}
		tweets.add(lonelyTweetModel);
	}
	public int getCount(){
		return tweets.size();
	}
	public LonelyTweetModel getItem(int i){
		return tweets.get(i-1);
	}
	public ArrayList<LonelyTweetModel> getTweets(){
		return tweets;
	}
	public Boolean hasTweet(LonelyTweetModel x){
		for (int i=0;i<tweets.size();i++){
			if (x==tweets.get(i)){
				return true;
			}
		}
		return false;
	}
}
/* assertEquals
assertSame
assertTrue
assertNotnull
fail()*/