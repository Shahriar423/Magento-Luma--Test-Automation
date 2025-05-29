package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SearchPage;

public class SearchTest extends BaseTest {
    public SearchTest() {
    }

    @Test
    public void ValidSearch() {
        SearchPage searchTest = new SearchPage(this.driver);
        searchTest.searchProduct("Jacket");
    }

    @Test
    public void testInvalidSearch() {
        SearchPage searchPage = new SearchPage(this.driver);
        searchPage.searchProduct("dddddddfcnkrjgweio11");
        Assert.assertTrue(searchPage.isNoResultsMessageDisplayed(), "No results message not displayed for invalid search");
    }
}
