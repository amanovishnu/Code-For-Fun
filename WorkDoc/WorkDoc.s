	.file	"WorkDoc.c"
	.text
	.globl	z
	.data
	.align 4
	.type	z, @object
	.size	z, 4
z:
	.long	10
	.section	.rodata
.LC0:
	.string	"Hello World"
	.align 8
.LC1:
	.string	"Value of Constant Variable:%d\n"
	.align 8
.LC2:
	.string	"Value of Character Varaible:%c\n"
	.align 8
.LC3:
	.string	"Value of TypeDef Variable:%lld\n"
	.align 8
.LC4:
	.string	"Value of Extern Variables X and Z:%d and %d\n"
	.text
	.globl	main
	.type	main, @function
main:
.LFB0:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$32, %rsp
	movl	$32, -16(%rbp)
	movb	$71, -17(%rbp)
	movq	$1000000, -8(%rbp)
	movl	$15, -12(%rbp)
	leaq	.LC0(%rip), %rdi
	call	puts@PLT
	movl	-16(%rbp), %eax
	movl	%eax, %esi
	leaq	.LC1(%rip), %rdi
	movl	$0, %eax
	call	printf@PLT
	movsbl	-17(%rbp), %eax
	movl	%eax, %esi
	leaq	.LC2(%rip), %rdi
	movl	$0, %eax
	call	printf@PLT
	movq	-8(%rbp), %rax
	movq	%rax, %rsi
	leaq	.LC3(%rip), %rdi
	movl	$0, %eax
	call	printf@PLT
	movl	z(%rip), %edx
	movl	-12(%rbp), %eax
	movl	%eax, %esi
	leaq	.LC4(%rip), %rdi
	movl	$0, %eax
	call	printf@PLT
	movl	$0, %eax
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE0:
	.size	main, .-main
	.section	.rodata
.LC5:
	.string	"The Square of %d is %d\n"
	.text
	.globl	calSquare
	.type	calSquare, @function
calSquare:
.LFB1:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$16, %rsp
	movl	%edi, -4(%rbp)
	movl	-4(%rbp), %eax
	imull	-4(%rbp), %eax
	movl	%eax, %edx
	movl	-4(%rbp), %eax
	movl	%eax, %esi
	leaq	.LC5(%rip), %rdi
	movl	$0, %eax
	call	printf@PLT
	nop
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1:
	.size	calSquare, .-calSquare
	.ident	"GCC: (Ubuntu 7.3.0-27ubuntu1~18.04) 7.3.0"
	.section	.note.GNU-stack,"",@progbits
