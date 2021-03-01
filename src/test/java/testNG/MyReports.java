package testNG;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import java.lang.annotation.Repeatable;

public class MyReports implements ITestListener {

    public void onTestStart(ITestResult result) {
        Reporter.log("OnTest Start" + result.getName());
    }

    public void onTestSuccess(ITestResult result) {
        Reporter.log("OnTest Sucess" + result.getName());
    }

    public void onTestFailure(ITestResult result) {
        Reporter.log("OnTest Fail" + result.getName());
        System.out.println("Take Screenshot");
    }

    public void onTestSkipped(ITestResult result) {
        Reporter.log("OnTest Skip" + result.getName());

    }

    public void onStart(ITestResult result) {
        Reporter.log("OnTest start" + result.getName());
    }

    public void onFinish(ITestResult result) {
        Reporter.log("OnTest finish" + result.getName());
    }
}