package Tests;

import Base.DriverSetup;
import Base.Gmail_Login;
import Pages.TC_008_CreateNewPost_000;
import org.testng.annotations.Test;


public class TC_008_CreateNewPost_Test_000 extends DriverSetup {

    @Test
    public void create_NewPost_test() throws InterruptedException {
        Gmail_Login access = new Gmail_Login(driver);
        access.signInGmail();

        TC_008_CreateNewPost_000 t_createPost = new TC_008_CreateNewPost_000(driver);
        t_createPost.clickOnCreatePost();
        Thread.sleep(10000);
        t_createPost.clickOnSelectBtn("C:\\Users\\zahan\\Documents\\Animee.jpg");
        Thread.sleep(3000);
//        t_createPost.clickOnNxtBtn();
//        Thread.sleep(3000);
//        t_createPost.clickOnNxtBtn2();
//        Thread.sleep(3000);
//        t_createPost.enterCaption("This is my first post");
//        Thread.sleep(3000);
//        t_createPost.clickOnShare();
//        Thread.sleep(3000);
//        System.out.println("File is Uploaded Successfully");
//        Thread.sleep(10000);

    }
}
