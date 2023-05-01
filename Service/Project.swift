import ProjectDescription
import ProjectDescriptionHelpers

let project = Project(
    name: "Service",
    settings: nil,
    targets: [
        Target(
            name: "Service",
            platform: .iOS,
            product: .framework,
            bundleId: "com.team-welchs.Service",
            deploymentTarget: .iOS(
                targetVersion: "15.0",
                devices: .iphone
            ),
            infoPlist: .default,
            sources: ["Sources/**"],
            dependencies: [
                .SPM.RxMoya,
                .SPM.RxSwift,
                .SPM.KeychainSwift
            ]
        )
    ]
)
