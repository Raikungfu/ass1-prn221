﻿#pragma checksum "..\..\..\WindowLogin.xaml" "{ff1816ec-aa5e-4d10-87f7-6f4963833460}" "941701A61BA7BAB2E384DF512D60D05892DEB23C"
//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Runtime Version:4.0.30319.42000
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

using System;
using System.Diagnostics;
using System.Windows;
using System.Windows.Automation;
using System.Windows.Controls;
using System.Windows.Controls.Primitives;
using System.Windows.Controls.Ribbon;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Ink;
using System.Windows.Input;
using System.Windows.Markup;
using System.Windows.Media;
using System.Windows.Media.Animation;
using System.Windows.Media.Effects;
using System.Windows.Media.Imaging;
using System.Windows.Media.Media3D;
using System.Windows.Media.TextFormatting;
using System.Windows.Navigation;
using System.Windows.Shapes;
using System.Windows.Shell;


namespace SalesWPFApp {
    
    
    /// <summary>
    /// WindowLogin
    /// </summary>
    public partial class WindowLogin : System.Windows.Window, System.Windows.Markup.IComponentConnector {
        
        
        #line 12 "..\..\..\WindowLogin.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.TextBox txtId;
        
        #line default
        #line hidden
        
        
        #line 15 "..\..\..\WindowLogin.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.TextBox txtPwPlaceholder;
        
        #line default
        #line hidden
        
        
        #line 19 "..\..\..\WindowLogin.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.PasswordBox txtPw;
        
        #line default
        #line hidden
        
        private bool _contentLoaded;
        
        /// <summary>
        /// InitializeComponent
        /// </summary>
        [System.Diagnostics.DebuggerNonUserCodeAttribute()]
        [System.CodeDom.Compiler.GeneratedCodeAttribute("PresentationBuildTasks", "8.0.4.0")]
        public void InitializeComponent() {
            if (_contentLoaded) {
                return;
            }
            _contentLoaded = true;
            System.Uri resourceLocater = new System.Uri("/SalesWPFApp;component/windowlogin.xaml", System.UriKind.Relative);
            
            #line 1 "..\..\..\WindowLogin.xaml"
            System.Windows.Application.LoadComponent(this, resourceLocater);
            
            #line default
            #line hidden
        }
        
        [System.Diagnostics.DebuggerNonUserCodeAttribute()]
        [System.CodeDom.Compiler.GeneratedCodeAttribute("PresentationBuildTasks", "8.0.4.0")]
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Never)]
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Design", "CA1033:InterfaceMethodsShouldBeCallableByChildTypes")]
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Maintainability", "CA1502:AvoidExcessiveComplexity")]
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1800:DoNotCastUnnecessarily")]
        void System.Windows.Markup.IComponentConnector.Connect(int connectionId, object target) {
            switch (connectionId)
            {
            case 1:
            this.txtId = ((System.Windows.Controls.TextBox)(target));
            
            #line 13 "..\..\..\WindowLogin.xaml"
            this.txtId.GotFocus += new System.Windows.RoutedEventHandler(this.TxtId_GotFocus);
            
            #line default
            #line hidden
            
            #line 13 "..\..\..\WindowLogin.xaml"
            this.txtId.LostFocus += new System.Windows.RoutedEventHandler(this.TxtId_LostFocus);
            
            #line default
            #line hidden
            return;
            case 2:
            this.txtPwPlaceholder = ((System.Windows.Controls.TextBox)(target));
            
            #line 17 "..\..\..\WindowLogin.xaml"
            this.txtPwPlaceholder.GotFocus += new System.Windows.RoutedEventHandler(this.txtPwPlaceholder_GotFocus);
            
            #line default
            #line hidden
            return;
            case 3:
            this.txtPw = ((System.Windows.Controls.PasswordBox)(target));
            
            #line 20 "..\..\..\WindowLogin.xaml"
            this.txtPw.PasswordChanged += new System.Windows.RoutedEventHandler(this.txtPw_PasswordChanged);
            
            #line default
            #line hidden
            
            #line 20 "..\..\..\WindowLogin.xaml"
            this.txtPw.LostFocus += new System.Windows.RoutedEventHandler(this.txtPw_LostFocus);
            
            #line default
            #line hidden
            return;
            case 4:
            
            #line 33 "..\..\..\WindowLogin.xaml"
            ((System.Windows.Controls.Button)(target)).Click += new System.Windows.RoutedEventHandler(this.Button_Click);
            
            #line default
            #line hidden
            return;
            case 5:
            
            #line 34 "..\..\..\WindowLogin.xaml"
            ((System.Windows.Controls.Button)(target)).Click += new System.Windows.RoutedEventHandler(this.Button_Click_1);
            
            #line default
            #line hidden
            return;
            }
            this._contentLoaded = true;
        }
    }
}

