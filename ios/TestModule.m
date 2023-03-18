//
//  TestModule.m
//  rn_automatic_data_parser
//
//  Created by Susan Thapa on 18/03/2023.
//

#import <Foundation/Foundation.h>
#import "React/RCTUIManager.h"

@interface RCT_EXTERN_MODULE (TestModule, NSObject)
RCT_EXTERN_METHOD(testMap
                  : (nonnull NSDictionary *) param
                  : (RCTPromiseResolveBlock) resolve
                  : (RCTPromiseRejectBlock) reject
                  )
RCT_EXTERN_METHOD(testArray
                  : (nonnull NSArray *) param
                  : (RCTPromiseResolveBlock) resolve
                  : (RCTPromiseRejectBlock) reject
                  )
RCT_EXTERN_METHOD(testNumberArray
                  : (nonnull NSArray *) param
                  : (RCTPromiseResolveBlock) resolve
                  : (RCTPromiseRejectBlock) reject
                  )
RCT_EXTERN_METHOD(testStringArray
                  : (nonnull NSArray *) param
                  : (RCTPromiseResolveBlock) resolve
                  : (RCTPromiseRejectBlock) reject
                  )
RCT_EXTERN_METHOD(testBooleanArray
                  : (nonnull NSArray *) param
                  : (RCTPromiseResolveBlock) resolve
                  : (RCTPromiseRejectBlock) reject
                  )
@end
