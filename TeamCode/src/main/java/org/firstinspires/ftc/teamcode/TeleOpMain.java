package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;



@TeleOp
public class TeleOpMain extends OpMode {
    RobotHardware rob = new RobotHardware();

    // This runs once when the user presses init
    @Override
    public void init() {
        rob.init(hardwareMap);
    }

    // This runs in a loop after the user presses play
    @Override
    public void loop() {
        // Controls drivetrain
        rob.leftMotor.setPower(gamepad1.left_stick_y);
        rob.rightMotor.setPower(gamepad1.right_stick_y);

        // Controls flywheels
        if (gamepad1.right_bumper) {
            rob.flywheelMotor.setPower(1);
        } else {
            rob.flywheelMotor.setPower(0);
        }

        // Controls Servos
        if (gamepad1.left_bumper) {
            rob.leftServo.setPosition(1);
            rob.rightServo.setPosition(0);
        } else {
            rob.leftServo.setPosition(0);
            rob.rightServo.setPosition(1);
        }
        telemetry.addData("Flywheel ticks/sec", rob.flywheelMotor.getVelocity());
        telemetry.addData("Flywheel power", rob.flywheelMotor.getPower());
        telemetry.update();
    }
}
