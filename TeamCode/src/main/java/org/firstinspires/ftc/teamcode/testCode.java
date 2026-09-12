package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.Range;

@TeleOp(name = "AllDone", group = "Linear OpMode")
public class testCode extends LinearOpMode {

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

        leftMotor.setDirection(DcMotor.Direction.REVERSE);
        rightMotor.setDirection(DcMotor.Direction.FORWARD);
        intake.setDirection(DcMotor.Direction.REVERSE);


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