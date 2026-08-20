package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.Range;

@TeleOp(name = "AllDone", group = "Linear OpMode")
public class drive extends LinearOpMode {

    private DcMotor leftMotor;
    private DcMotor rightMotor;
    private DcMotor intake;
    private DcMotor launching;
    private DcMotor launchControl;



    @Override
    public void runOpMode() {

        leftMotor = hardwareMap.get(DcMotor.class, "left_drive");
        rightMotor = hardwareMap.get(DcMotor.class, "right_drive");
        intake = hardwareMap.get(DcMotor.class, "intake");
        launching = hardwareMap.get(DcMotor.class, "launching");
        launchControl = hardwareMap.get(DcMotor.class, "launchControl");

        leftMotor.setDirection(DcMotor.Direction.REVERSE);
        rightMotor.setDirection(DcMotor.Direction.FORWARD);
        launching.setDirection(DcMotor.Direction.REVERSE);
        intake.setDirection(DcMotor.Direction.REVERSE);
        launchControl.setDirection(DcMotor.Direction.REVERSE);

        telemetry.addData("Status", "Initialized");
        telemetry.update();
        boolean launchSystem = false;
        boolean launchControlSystem = false;
        waitForStart();

        while (opModeIsActive()) {
            double leftPower;
            double rightPower;
            // Drive
            double drive = -gamepad1.left_stick_y;
            double turn  =  gamepad1.right_stick_x;
            leftPower = Range.clip(drive + turn, -1.0, 1.0) ;
            rightPower = Range.clip(drive - turn, -1.0, 1.0) ;

            //movements
            leftMotor.setPower(leftPower);
            rightMotor.setPower(rightPower);

            // Launch control
            if (gamepad1.left_bumper) {
                launchControlSystem = true;
            }
            if (gamepad1.right_bumper) {
                launchControlSystem = false;
            }
            if (launchControlSystem) {
                launchControl.setPower(-1);
            } else {
                launchControl.setPower(0);
            }


            //launch system on/off
            if (gamepad1.a) {
                launchSystem = true;
            }

            if (gamepad1.b) {
                launchSystem = false;
            }
            if (launchSystem) {
                launching.setPower(-1);
            } else {
                launching.setPower(0);
            }


            // Intake Motor
            double intakePower = gamepad1.right_trigger - gamepad1.left_trigger;
            intake.setPower(intakePower);

            // Same direction
            telemetry.addData("Left Motor", leftPower);
            telemetry.addData("Right Motor", rightPower);
            telemetry.update();

            idle();
        }
    }
}