package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.Servo;

@Autonomous
public class AutoMain extends LinearOpMode {
    RobotHardware rob = new RobotHardware();
    @Override
    public void runOpMode() {
        rob.init(hardwareMap);
        waitForStart();
        runTime
        rob.leftMotor.setPower(1);
        rob.rightMotor.setPower(1);

    }
}
