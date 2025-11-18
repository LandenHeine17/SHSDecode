package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous
public class Testing extends OpMode {

    DcMotor leftFront, rightFront, leftBack, rightBack;

    ElapsedTime timer = new ElapsedTime();

    // This is a comment
    @Override
    public void init(){
        telemetry.addData("Status", "This is initialized (:");
        leftFront = hardwareMap.get(DcMotor.class, "leftFront");
        rightFront = hardwareMap.get(DcMotor.class, "rightFront");
        leftBack = hardwareMap.get(DcMotor.class, "leftBack");
        rightBack = hardwareMap.get(DcMotor.class, "rightBack");

        timer.reset();
    }

    public void forward() {
        leftFront.setPower(1);
        leftBack.setPower(1);
        rightFront.setPower(1);
        rightBack.setPower(1);
    }

    public void backward() {
        leftFront.setPower(-1);
        leftBack.setPower(-1);
        rightFront.setPower(-1);
        rightBack.setPower(-1);
    }
    public void strafe() {
        leftFront.setPower(-1);
        leftBack.setPower(1);
        rightFront.setPower(1);
        rightBack.setPower(-1);
    }




    @Override
    public void loop() {
        forward();
        if (7 > timer.time()) {
            forward();
        } else {
            strafe();
        }
    }

}
