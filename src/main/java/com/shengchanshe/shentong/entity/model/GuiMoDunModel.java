package com.shengchanshe.shentong.entity.model;// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class GuiMoDunModel extends ModelBase {
	private final ModelRenderer zhenmo;
	private final ModelRenderer Body_r1;
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer Head_r1;
	private final ModelRenderer Head_r2;
	private final ModelRenderer Head_r3;
	private final ModelRenderer jiao4;
	private final ModelRenderer Head_r4;
	private final ModelRenderer Head_r5;
	private final ModelRenderer Head_r6;
	private final ModelRenderer jiao2;
	private final ModelRenderer Head_r7;
	private final ModelRenderer Head_r8;
	private final ModelRenderer Head_r9;
	private final ModelRenderer bone2;
	private final ModelRenderer Body_r2;
	private final ModelRenderer Body_r3;
	private final ModelRenderer Body_r4;
	private final ModelRenderer Body_r5;
	private final ModelRenderer bone3;
	private final ModelRenderer Body_r6;
	private final ModelRenderer bone4;
	private final ModelRenderer Body_r7;
	private final ModelRenderer Body_r8;
	private final ModelRenderer Body_r9;
	private final ModelRenderer Body_r10;
	private final ModelRenderer Body_r11;
	private final ModelRenderer bone5;
	private final ModelRenderer Body_r12;
	private final ModelRenderer Body_r13;
	private final ModelRenderer Body_r14;
	private final ModelRenderer Body_r15;
	private final ModelRenderer bone6;
	private final ModelRenderer Body_r16;
	private final ModelRenderer bone7;
	private final ModelRenderer Body_r17;
	private final ModelRenderer Body_r18;
	private final ModelRenderer Body_r19;
	private final ModelRenderer Body_r20;
	private final ModelRenderer Body_r21;
	private final ModelRenderer Body_r22;

	public GuiMoDunModel() {
		textureWidth = 256;
		textureHeight = 256;

		zhenmo = new ModelRenderer(this);
		zhenmo.setRotationPoint(0.0F, 24.0F, -13.0F);
		zhenmo.cubeList.add(new ModelBox(zhenmo, 0, 60, -7.0F, -42.0F, 12.5F, 14, 8, 7, 0.0F, false));

		Body_r1 = new ModelRenderer(this);
		Body_r1.setRotationPoint(0.0F, -23.0F, 36.0F);
		zhenmo.addChild(Body_r1);
		setRotationAngle(Body_r1, -0.2182F, 0.0F, 0.0F);
		Body_r1.cubeList.add(new ModelBox(Body_r1, 76, 39, -5.0F, 2.0F, -23.0F, 10, 6, 7, 0.0F, false));
		Body_r1.cubeList.add(new ModelBox(Body_r1, 65, 23, -6.0F, -7.0F, -23.0F, 12, 9, 7, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, -41.0F, 14.0F);
		zhenmo.addChild(bone);
		setRotationAngle(bone, 0.0436F, 0.0F, 0.0F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -4.2F, 7.0F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.6087F, 0.3665F, 0.3781F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 7, 1.2731F, 6.5485F, -12.5212F, 2, 1, 2, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -4.2F, 7.0F);
		bone.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.6087F, -0.3665F, -0.3781F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 28, 20, -3.2731F, 6.5485F, -12.5212F, 2, 1, 2, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, -4.2F, 7.0F);
		bone.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.1309F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 28, 15, -1.0F, -0.3001F, -14.9035F, 2, 3, 2, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, -4.2F, 7.0F);
		bone.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.7418F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 28, 9, -1.0F, 4.2999F, -12.4035F, 2, 4, 2, 0.0F, false));

		Head_r1 = new ModelRenderer(this);
		Head_r1.setRotationPoint(0.0F, -15.0F, -5.0F);
		bone.addChild(Head_r1);
		setRotationAngle(Head_r1, 0.0F, 0.0F, 0.7854F);
		Head_r1.cubeList.add(new ModelBox(Head_r1, 114, 59, 1.5F, 1.5029F, -1.7333F, 5, 5, 5, 0.0F, false));

		Head_r2 = new ModelRenderer(this);
		Head_r2.setRotationPoint(0.0F, -3.0F, 7.0F);
		bone.addChild(Head_r2);
		setRotationAngle(Head_r2, 0.0873F, 0.0F, 0.0F);
		Head_r2.cubeList.add(new ModelBox(Head_r2, 64, 114, -1.5F, 3.1F, -14.15F, 3, 4, 2, 0.0F, false));
		Head_r2.cubeList.add(new ModelBox(Head_r2, 126, 20, -2.0F, -0.9F, -14.9F, 4, 4, 3, 0.0F, false));

		Head_r3 = new ModelRenderer(this);
		Head_r3.setRotationPoint(0.0F, -3.0F, 7.0F);
		bone.addChild(Head_r3);
		setRotationAngle(Head_r3, -0.1745F, 0.0F, 0.0F);
		Head_r3.cubeList.add(new ModelBox(Head_r3, 44, 60, -4.0F, -5.0F, -13.8F, 8, 9, 11, 0.0F, false));

		jiao4 = new ModelRenderer(this);
		jiao4.setRotationPoint(1.1F, -6.15F, -3.2F);
		bone.addChild(jiao4);
		setRotationAngle(jiao4, -0.4815F, 0.3138F, -0.3627F);
		

		Head_r4 = new ModelRenderer(this);
		Head_r4.setRotationPoint(0.0F, 5.422F, 12.8965F);
		jiao4.addChild(Head_r4);
		setRotationAngle(Head_r4, 0.9754F, 1.1699F, 1.2065F);
		Head_r4.cubeList.add(new ModelBox(Head_r4, 66, 20, 10.2425F, -21.1272F, 3.5175F, 1, 3, 1, 0.0F, false));
		Head_r4.cubeList.add(new ModelBox(Head_r4, 126, 129, 9.9925F, -19.1272F, 3.5175F, 1, 3, 2, 0.0F, false));
		Head_r4.cubeList.add(new ModelBox(Head_r4, 106, 129, 9.7425F, -17.1272F, 3.2675F, 2, 4, 3, 0.0F, false));

		Head_r5 = new ModelRenderer(this);
		Head_r5.setRotationPoint(0.0F, 5.422F, 12.8965F);
		jiao4.addChild(Head_r5);
		setRotationAngle(Head_r5, 1.4554F, 1.1699F, 1.2065F);
		Head_r5.cubeList.add(new ModelBox(Head_r5, 46, 34, 9.2425F, -12.8272F, 9.7675F, 3, 5, 2, 0.0F, false));
		Head_r5.cubeList.add(new ModelBox(Head_r5, 0, 129, 8.7425F, -12.1272F, 8.7675F, 4, 4, 2, 0.0F, false));

		Head_r6 = new ModelRenderer(this);
		Head_r6.setRotationPoint(0.0F, 4.322F, 12.8965F);
		jiao4.addChild(Head_r6);
		setRotationAngle(Head_r6, 1.4554F, 1.1699F, 1.2065F);
		Head_r6.cubeList.add(new ModelBox(Head_r6, 126, 13, 8.7425F, -11.3272F, 6.2675F, 4, 4, 3, 0.0F, false));
		Head_r6.cubeList.add(new ModelBox(Head_r6, 34, 96, 8.7425F, -11.8272F, 3.2675F, 4, 5, 3, 0.0F, false));

		jiao2 = new ModelRenderer(this);
		jiao2.setRotationPoint(-1.1F, -6.15F, -3.2F);
		bone.addChild(jiao2);
		setRotationAngle(jiao2, -0.4815F, -0.3138F, 0.3627F);
		

		Head_r7 = new ModelRenderer(this);
		Head_r7.setRotationPoint(0.0F, 5.422F, 12.8965F);
		jiao2.addChild(Head_r7);
		setRotationAngle(Head_r7, 0.9754F, -1.1699F, -1.2065F);
		Head_r7.cubeList.add(new ModelBox(Head_r7, 66, 20, -11.2425F, -21.1272F, 3.5175F, 1, 3, 1, 0.0F, true));
		Head_r7.cubeList.add(new ModelBox(Head_r7, 126, 129, -11.4925F, -19.1272F, 3.5175F, 1, 3, 2, 0.0F, true));
		Head_r7.cubeList.add(new ModelBox(Head_r7, 106, 129, -11.7425F, -17.1272F, 3.2675F, 2, 4, 3, 0.0F, true));

		Head_r8 = new ModelRenderer(this);
		Head_r8.setRotationPoint(0.0F, 5.422F, 12.8965F);
		jiao2.addChild(Head_r8);
		setRotationAngle(Head_r8, 1.4554F, -1.1699F, -1.2065F);
		Head_r8.cubeList.add(new ModelBox(Head_r8, 46, 34, -12.2425F, -12.8272F, 9.7675F, 3, 5, 2, 0.0F, true));
		Head_r8.cubeList.add(new ModelBox(Head_r8, 0, 129, -12.7425F, -12.1272F, 8.7675F, 4, 4, 2, 0.0F, true));

		Head_r9 = new ModelRenderer(this);
		Head_r9.setRotationPoint(0.0F, 4.322F, 12.8965F);
		jiao2.addChild(Head_r9);
		setRotationAngle(Head_r9, 1.4554F, -1.1699F, -1.2065F);
		Head_r9.cubeList.add(new ModelBox(Head_r9, 126, 13, -12.7425F, -11.3272F, 6.2675F, 4, 4, 3, 0.0F, true));
		Head_r9.cubeList.add(new ModelBox(Head_r9, 34, 96, -12.7425F, -11.8272F, 3.2675F, 4, 5, 3, 0.0F, true));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, -29.0F, 36.0F);
		zhenmo.addChild(bone2);
		

		Body_r2 = new ModelRenderer(this);
		Body_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(Body_r2);
		setRotationAngle(Body_r2, 0.0F, 0.0F, 1.1781F);
		Body_r2.cubeList.add(new ModelBox(Body_r2, 74, 101, -6.2F, -26.0F, -22.3F, 4, 12, 7, 0.0F, true));

		Body_r3 = new ModelRenderer(this);
		Body_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(Body_r3);
		setRotationAngle(Body_r3, 0.0F, 0.0F, 0.829F);
		Body_r3.cubeList.add(new ModelBox(Body_r3, 18, 96, -1.2F, -23.0F, -22.8F, 4, 11, 8, 0.0F, true));

		Body_r4 = new ModelRenderer(this);
		Body_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(Body_r4);
		setRotationAngle(Body_r4, 0.0F, 0.0F, 0.48F);
		Body_r4.cubeList.add(new ModelBox(Body_r4, 0, 76, 2.8F, -19.0F, -23.3F, 4, 19, 9, 0.0F, true));

		Body_r5 = new ModelRenderer(this);
		Body_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(Body_r5);
		setRotationAngle(Body_r5, 0.0F, 0.0F, 0.3491F);
		Body_r5.cubeList.add(new ModelBox(Body_r5, 46, 30, -3.0F, -17.0F, -24.3F, 4, 19, 11, 0.0F, true));
		Body_r5.cubeList.add(new ModelBox(Body_r5, 18, 25, 1.0F, -24.0F, -23.8F, 4, 25, 10, 0.0F, true));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(12.0F, -6.3F, -19.5F);
		bone2.addChild(bone3);
		setRotationAngle(bone3, -2.7462F, 1.3357F, 2.4019F);
		

		Body_r6 = new ModelRenderer(this);
		Body_r6.setRotationPoint(-13.933F, 6.2347F, 20.0F);
		bone3.addChild(Body_r6);
		setRotationAngle(Body_r6, 0.0F, 0.0F, 1.309F);
		Body_r6.cubeList.add(new ModelBox(Body_r6, 105, 47, 2.8F, -20.0F, -21.3F, 9, 7, 5, 0.0F, true));
		Body_r6.cubeList.add(new ModelBox(Body_r6, 93, 93, -6.2F, -20.0F, -21.8F, 9, 9, 6, 0.0F, true));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(5.067F, 11.2347F, 1.0F);
		bone3.addChild(bone4);
		setRotationAngle(bone4, -0.7321F, -0.6247F, 0.447F);
		

		Body_r7 = new ModelRenderer(this);
		Body_r7.setRotationPoint(-4.0F, 13.0F, -13.0F);
		bone4.addChild(Body_r7);
		setRotationAngle(Body_r7, 2.5147F, 0.6881F, -2.3318F);
		Body_r7.cubeList.add(new ModelBox(Body_r7, 124, 125, -3.7715F, -4.4978F, -0.8219F, 6, 1, 3, 0.0F, true));
		Body_r7.cubeList.add(new ModelBox(Body_r7, 125, 82, -3.7715F, -2.2478F, -0.8219F, 6, 1, 3, 0.0F, true));
		Body_r7.cubeList.add(new ModelBox(Body_r7, 125, 86, -3.7715F, 0.0022F, -0.8219F, 6, 1, 3, 0.0F, true));
		Body_r7.cubeList.add(new ModelBox(Body_r7, 106, 125, -3.7715F, 2.5022F, -0.8219F, 6, 1, 3, 0.0F, true));

		Body_r8 = new ModelRenderer(this);
		Body_r8.setRotationPoint(2.0F, 10.0F, -8.2F);
		bone4.addChild(Body_r8);
		setRotationAngle(Body_r8, 2.7609F, 0.4573F, -2.6458F);
		Body_r8.cubeList.add(new ModelBox(Body_r8, 103, 59, 0.5448F, -2.0748F, -0.3354F, 4, 1, 3, 0.0F, true));

		Body_r9 = new ModelRenderer(this);
		Body_r9.setRotationPoint(-19.0F, -5.0F, 18.0F);
		bone4.addChild(Body_r9);
		setRotationAngle(Body_r9, 1.0885F, 1.0339F, 2.2646F);
		Body_r9.cubeList.add(new ModelBox(Body_r9, 36, 30, 21.8F, -19.0F, 16.2F, 7, 1, 3, 0.0F, true));
		Body_r9.cubeList.add(new ModelBox(Body_r9, 52, 80, 21.8F, -21.5F, 16.2F, 7, 1, 3, 0.0F, true));
		Body_r9.cubeList.add(new ModelBox(Body_r9, 103, 42, 21.8F, -23.75F, 16.2F, 7, 1, 3, 0.0F, true));
		Body_r9.cubeList.add(new ModelBox(Body_r9, 120, 0, 21.8F, -26.0F, 16.2F, 7, 1, 3, 0.0F, true));

		Body_r10 = new ModelRenderer(this);
		Body_r10.setRotationPoint(2.0F, 10.0F, -8.2F);
		bone4.addChild(Body_r10);
		setRotationAngle(Body_r10, 2.8181F, 1.1179F, -2.4152F);
		Body_r10.cubeList.add(new ModelBox(Body_r10, 128, 33, -1.4306F, -1.384F, -1.4404F, 4, 1, 3, 0.0F, true));

		Body_r11 = new ModelRenderer(this);
		Body_r11.setRotationPoint(-19.0F, -5.0F, 18.0F);
		bone4.addChild(Body_r11);
		setRotationAngle(Body_r11, 0.5672F, 0.5672F, 1.5708F);
		Body_r11.cubeList.add(new ModelBox(Body_r11, 99, 82, 7.8F, -25.0F, 2.2F, 10, 6, 3, 0.0F, true));
		Body_r11.cubeList.add(new ModelBox(Body_r11, 42, 110, 22.8F, -26.0F, -1.8F, 7, 8, 4, 0.0F, true));
		Body_r11.cubeList.add(new ModelBox(Body_r11, 71, 54, 12.8F, -27.0F, -2.8F, 10, 10, 6, 0.0F, true));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, -29.0F, 36.0F);
		zhenmo.addChild(bone5);
		

		Body_r12 = new ModelRenderer(this);
		Body_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone5.addChild(Body_r12);
		setRotationAngle(Body_r12, 0.0F, 0.0F, -1.1781F);
		Body_r12.cubeList.add(new ModelBox(Body_r12, 74, 101, 2.2F, -26.0F, -22.3F, 4, 12, 7, 0.0F, false));

		Body_r13 = new ModelRenderer(this);
		Body_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone5.addChild(Body_r13);
		setRotationAngle(Body_r13, 0.0F, 0.0F, -0.829F);
		Body_r13.cubeList.add(new ModelBox(Body_r13, 18, 96, -2.8F, -23.0F, -22.8F, 4, 11, 8, 0.0F, false));

		Body_r14 = new ModelRenderer(this);
		Body_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone5.addChild(Body_r14);
		setRotationAngle(Body_r14, 0.0F, 0.0F, -0.48F);
		Body_r14.cubeList.add(new ModelBox(Body_r14, 0, 76, -6.8F, -19.0F, -23.3F, 4, 19, 9, 0.0F, false));

		Body_r15 = new ModelRenderer(this);
		Body_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone5.addChild(Body_r15);
		setRotationAngle(Body_r15, 0.0F, 0.0F, -0.3491F);
		Body_r15.cubeList.add(new ModelBox(Body_r15, 46, 30, -1.0F, -17.0F, -24.3F, 4, 19, 11, 0.0F, false));
		Body_r15.cubeList.add(new ModelBox(Body_r15, 18, 25, -5.0F, -24.0F, -23.8F, 4, 25, 10, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-12.0F, -6.3F, -19.5F);
		bone5.addChild(bone6);
		setRotationAngle(bone6, -1.7683F, -0.6444F, -3.0074F);
		

		Body_r16 = new ModelRenderer(this);
		Body_r16.setRotationPoint(13.933F, 6.2347F, 20.0F);
		bone6.addChild(Body_r16);
		setRotationAngle(Body_r16, 0.0F, 0.0F, -1.309F);
		Body_r16.cubeList.add(new ModelBox(Body_r16, 105, 47, -11.8F, -20.0F, -21.3F, 9, 7, 5, 0.0F, false));
		Body_r16.cubeList.add(new ModelBox(Body_r16, 93, 93, -2.8F, -20.0F, -21.8F, 9, 9, 6, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-5.067F, 11.2347F, 2.0F);
		bone6.addChild(bone7);
		setRotationAngle(bone7, 2.9953F, 1.3467F, 2.6724F);
		

		Body_r17 = new ModelRenderer(this);
		Body_r17.setRotationPoint(-2.0F, 10.0F, -8.2F);
		bone7.addChild(Body_r17);
		setRotationAngle(Body_r17, 2.7609F, -0.4573F, 2.6458F);
		Body_r17.cubeList.add(new ModelBox(Body_r17, 103, 59, -4.5448F, -2.0748F, -0.3354F, 4, 1, 3, 0.0F, false));

		Body_r18 = new ModelRenderer(this);
		Body_r18.setRotationPoint(1.0F, 12.0F, -6.0F);
		bone7.addChild(Body_r18);
		setRotationAngle(Body_r18, 2.3616F, -0.897F, 2.7821F);
		Body_r18.cubeList.add(new ModelBox(Body_r18, 36, 30, -5.3795F, 2.149F, -0.6192F, 5, 1, 3, 0.0F, false));
		Body_r18.cubeList.add(new ModelBox(Body_r18, 52, 80, -5.3795F, -0.351F, -0.6192F, 5, 1, 3, 0.0F, false));
		Body_r18.cubeList.add(new ModelBox(Body_r18, 103, 42, -5.3795F, -2.601F, -0.6192F, 5, 1, 3, 0.0F, false));

		Body_r19 = new ModelRenderer(this);
		Body_r19.setRotationPoint(1.0F, 12.0F, -6.0F);
		bone7.addChild(Body_r19);
		setRotationAngle(Body_r19, 0.8497F, -0.9469F, -1.7632F);
		Body_r19.cubeList.add(new ModelBox(Body_r19, 192, 31, -15.3795F, -15.851F, -10.6192F, 0, 23, 23, 0.0F, false));

		Body_r20 = new ModelRenderer(this);
		Body_r20.setRotationPoint(1.0F, 12.0F, -6.0F);
		bone7.addChild(Body_r20);
		setRotationAngle(Body_r20, 1.0722F, -1.0476F, -2.0273F);
		Body_r20.cubeList.add(new ModelBox(Body_r20, 120, 0, -12.3795F, -4.851F, -0.6192F, 6, 1, 3, 0.0F, false));
		Body_r20.cubeList.add(new ModelBox(Body_r20, 120, 0, -6.3795F, -4.851F, -0.6192F, 6, 1, 3, 0.0F, false));

		Body_r21 = new ModelRenderer(this);
		Body_r21.setRotationPoint(-2.0F, 10.0F, -8.2F);
		bone7.addChild(Body_r21);
		setRotationAngle(Body_r21, 2.8181F, -1.1179F, 2.4152F);
		Body_r21.cubeList.add(new ModelBox(Body_r21, 128, 33, -2.5694F, -1.384F, -1.4404F, 4, 1, 3, 0.0F, false));

		Body_r22 = new ModelRenderer(this);
		Body_r22.setRotationPoint(19.0F, -5.0F, 18.0F);
		bone7.addChild(Body_r22);
		setRotationAngle(Body_r22, 0.5672F, -0.5672F, -1.5708F);
		Body_r22.cubeList.add(new ModelBox(Body_r22, 99, 82, -17.8F, -25.0F, 2.2F, 10, 6, 3, 0.0F, false));
		Body_r22.cubeList.add(new ModelBox(Body_r22, 42, 110, -29.8F, -26.0F, -1.8F, 7, 8, 4, 0.0F, false));
		Body_r22.cubeList.add(new ModelBox(Body_r22, 71, 54, -22.8F, -27.0F, -2.8F, 10, 10, 6, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		zhenmo.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}