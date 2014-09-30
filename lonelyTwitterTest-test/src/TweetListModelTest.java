import java.util.ArrayList;

import android.test.ActivityInstrumentationTestCase2;
import ca.ualberta.cs.lonelytwitter.LonelyTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.TweetListModel;

public class TweetListModelTest extends
ActivityInstrumentationTestCase2<LonelyTwitterActivity> {
	public TweetListModelTest(){
		super(LonelyTwitterActivity.class);
		
	}
	public void testAddTweets(){
		TweetListModel tlm = new TweetListModel();
		tlm.add(new LonelyTweetModel("Test"));
		assertEquals(tlm.getCount(),1);
	}
	public void testGetItem(){
		TweetListModel tlm = new TweetListModel();
		LonelyTweetModel firstTweet = new LonelyTweetModel("test");
		tlm.add(firstTweet);
		assertSame(firstTweet, tlm.getItem(1));
		try{
			tlm.add(firstTweet);
		}catch(IllegalArgumentException e){
			assertEquals(e.getClass(),IllegalArgumentException.class);
		}
	}
	public void testGetTweets(){
		TweetListModel tlm = new TweetListModel();
		LonelyTweetModel firstTweet = new LonelyTweetModel("test1");
		LonelyTweetModel secondTweet = new LonelyTweetModel("test2");
		LonelyTweetModel thirdTweet = new LonelyTweetModel ("test3");
		
		ArrayList<LonelyTweetModel> tlm2= new ArrayList<LonelyTweetModel>();

		tlm.add(firstTweet);
		tlm.add(secondTweet);
		tlm.add(thirdTweet);
		
		tlm2.add(firstTweet);
		tlm2.add(secondTweet);
		tlm2.add(thirdTweet);
		
		assertEquals(tlm.getTweets(), tlm2);
		
	}
	public void testHasTweet(){
		TweetListModel tlm = new TweetListModel();
		LonelyTweetModel firstTweet= new LonelyTweetModel("test1");
		LonelyTweetModel secondTweet= new LonelyTweetModel("test2");
		
		tlm.add(firstTweet);
		assertTrue(tlm.hasTweet(firstTweet));
		assertFalse(tlm.hasTweet(secondTweet));
		
		
	}
	public void testGetCount(){
		TweetListModel tlm= new TweetListModel();
		LonelyTweetModel firstTweet = new LonelyTweetModel("test1");
		LonelyTweetModel secondTweet = new LonelyTweetModel("test2");
		LonelyTweetModel thirdTweet = new LonelyTweetModel ("test3");
		
		tlm.add(firstTweet);
		tlm.add(secondTweet);
		tlm.add(thirdTweet);
		
		assertEquals(3,tlm.getCount());
			
	}
	
}
